package org.goots.exploder.types;

import org.apache.commons.compress.archivers.ArchiveStreamFactory;

import java.io.File;

public class TarFileType
                extends ArchiveFileType
{
    @Override
    public String getUncompressedFilename( File source )
    {
        return source.getName();
    }

    @Override
    public String getTypename()
    {
        return ArchiveStreamFactory.TAR;
    }
}