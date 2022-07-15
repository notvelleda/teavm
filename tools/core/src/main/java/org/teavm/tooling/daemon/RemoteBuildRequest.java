/*
 *  Copyright 2018 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.tooling.daemon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.teavm.backend.wasm.render.WasmBinaryVersion;
import org.teavm.tooling.TeaVMTargetType;
import org.teavm.vm.TeaVMOptimizationLevel;

public class RemoteBuildRequest implements Serializable {
    public final List<String> sourceDirectories = new ArrayList<>();
    public final List<String> sourceJarFiles = new ArrayList<>();
    public final List<String> classPath = new ArrayList<>();
    public String[] transformers;
    public String[] classesToPreserve;
    public TeaVMTargetType targetType;
    public String mainClass;
    public String entryPointName;
    public String targetDirectory;
    public String tagetFileName = "";
    public boolean sourceMapsFileGenerated;
    public boolean debugInformationGenerated;
    public boolean sourceFilesCopied;
    public boolean incremental;
    public String cacheDirectory;
    public boolean obfuscated;
    public boolean strict;
    public int maxTopLevelNames;
    public Properties properties;
    public TeaVMOptimizationLevel optimizationLevel;
    public boolean fastDependencyAnalysis;
    public WasmBinaryVersion wasmVersion;
    public int minHeapSize;
    public int maxHeapSize;
    public boolean longjmpSupported;
    public boolean heapDump;
    public boolean shortFileNames;
    public boolean assertionsRemoved;
}
