package com.google.api.client.http;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @Description: To support file content from InputStream directly
 *
 */
public final class FileContentStream extends FileContent {

	private final InputStream inputStream;

	public FileContentStream(String type, File file, InputStream inputStream) {
		super(type, file);

		this.inputStream = inputStream;
	}

	@Override
    public long getLength() throws IOException {
	    long size =  inputStream.available();
	    //System.out.println("+++++++===FileContentStream getLength: " + size);
	    return size;
	  }

	@Override
	public InputStream getInputStream() throws FileNotFoundException {
		//System.out.println("==## FileContentStream file direct get from inputStram");
		return inputStream;
	}

}
