/**
 *    Copyright 2016 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.fixprotocol.orchestra.transformers;

import org.junit.Assert;
import org.junit.Test;

import io.fixprotocol.orchestra.transformers.RepositoryXslTransformer;

import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

public class XslTransformerTest {
    @Test
    public void testTransformer() throws IOException, TransformerException {
        String[] arr = new String[3];
        arr[0] = Thread.currentThread().getContextClassLoader().getResource("xsl/Repository2010to2016.xsl")
                .getFile();
        arr[1] = Thread.currentThread().getContextClassLoader().getResource("FixRepository.xml")
                .getFile();
        arr[2] = System.getProperty("java.io.tmpdir").concat("/output.xml");
        RepositoryXslTransformer.main(arr);
        File outFile = new File(arr[2]);
        Assert.assertTrue(outFile.exists());
    }
}
