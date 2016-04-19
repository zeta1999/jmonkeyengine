/*
 * Copyright (c) 2009-2016 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.opencl.lwjgl;

import com.jme3.opencl.*;
import com.jme3.scene.VertexBuffer;
import com.jme3.scene.mesh.IndexBuffer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.opencl.CLContext;

/**
 *
 * @author Sebastian Weiss
 */
public class LwjglContext implements Context {
    private final CLContext context;

    public LwjglContext(CLContext context) {
        this.context = context;
    }

    public CLContext getContext() {
        return context;
    }

    @Override
    public List<? extends Device> getDevices() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CommandQueue createQueue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CommandQueue createQueue(Device device) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Buffer createBuffer(int size, MemoryAccess access) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Buffer createBuffer(int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Buffer useHostBuffer(ByteBuffer data, int size, MemoryAccess access) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Buffer useHostBuffer(ByteBuffer data, int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Image createImage(MemoryAccess access, ImageFormat format, ImageDescriptor descr, ByteBuffer hostPtr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Buffer bindVertexBuffer(VertexBuffer vb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Buffer bindIndexBuffer(IndexBuffer ib) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Image bindImage(com.jme3.texture.Image image) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Program createProgramFromSourceCode(String sourceCode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Program createProgramFromSourceFilesWithInclude(String include, String... resources) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Program createProgramFormSourcesWithInclude(String include, List<String> resources) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Program createProgramFromSources(String... resources) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Program createProgramFromSources(List<String> resources) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
