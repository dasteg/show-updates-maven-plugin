package com.github.ccguyka.showupdates.filter;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;

class MajorVersionFilter implements VersionFilter {

    @Override
    public boolean filter(final DefaultArtifactVersion updateVersion, final ArtifactVersion artifactVersion) {
        return true;
    }
}
