/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
 */
package org.wso2.carbon.event.execution.manager.core;

public interface TemplateDeployer {

    String getType();

    /**
     * This method is used to deploy an artifact given under a Template.
     *
     * @param template The template, updated with user-specified parameters.
     * @throws TemplateDeploymentException
     */
    void deployArtifact(DeployableTemplate template) throws TemplateDeploymentException;

    /**
     * Undeploys an artifact, given its ID.
     *
     * @param artifactId Unique ID for the artifact. E.g. If the artifact is a CEP Execution Plan, then plan name is the artifactId.
     * @throws TemplateDeploymentException
     */
    void undeployArtifact(String artifactId) throws TemplateDeploymentException;

    /**
     * This method is used to deploy an artifact given under Common Artifacts.
     *
     * @param template
     */
    void deployIfNotDoneAlready(DeployableTemplate template) throws TemplateDeploymentException;

}
