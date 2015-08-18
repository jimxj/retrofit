/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrofit;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.reflect.Type;

class ToStringConverterFactory implements Converter.Factory {
  private static final MediaType MEDIA_TYPE = MediaType.parse("text/plain");

  @Override public Converter get(Type type) {
    if (type != String.class) {
      return null;
    }
    return new StringConverter();
  }

  static class StringConverter implements Converter<Object> {
    @Override public String fromBody(ResponseBody body) throws IOException {
      return body.string();
    }

    @Override public RequestBody toBody(Object value) {
      return RequestBody.create(MEDIA_TYPE, String.valueOf(value));
    }
  }
}
