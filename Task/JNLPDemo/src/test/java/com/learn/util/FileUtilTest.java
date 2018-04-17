package com.learn.util; import org.junit.Assert;import org.junit.Test;import org.junit.Before; import org.junit.After;import org.springframework.core.io.ByteArrayResource;/** * FileUtil Tester. * * @author <Authors name> * @since <pre>���� 15, 2018</pre> * @version 1.0 */ public class FileUtilTest { @Beforepublic void before() throws Exception { } @Afterpublic void after() throws Exception { } /** * * Method: getResource(String filename) * */ @Testpublic void testGetResource() throws Exception {    ByteArrayResource byteArrayResource = FileUtil.getResource("jnlp/test.jnlp");    Assert.assertNotNull(byteArrayResource);    String content = new String(byteArrayResource.getByteArray());    //String content = String.valueOf(byteArrayResource.getByteArray());    Assert.assertTrue(content.contains("<jnlp "));} /** * * Method: filenameValidation(String filename) * */ @Testpublic void testFilenameValidation() throws Exception {    Assert.assertTrue(FileUtil.filenameValidation("this.jnlp"));} } 