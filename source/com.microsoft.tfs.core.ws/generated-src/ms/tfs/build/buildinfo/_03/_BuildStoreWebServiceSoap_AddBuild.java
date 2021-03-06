// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildData;
import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_AddBuild;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildStoreWebServiceSoap_AddBuild
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String teamProject;
    protected _BuildData buildData;

    public _BuildStoreWebServiceSoap_AddBuild()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_AddBuild(
        final String teamProject,
        final _BuildData buildData)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTeamProject(teamProject);
        setBuildData(buildData);
    }

    public String getTeamProject()
    {
        return this.teamProject;
    }

    public void setTeamProject(String value)
    {
        this.teamProject = value;
    }

    public _BuildData getBuildData()
    {
        return this.buildData;
    }

    public void setBuildData(_BuildData value)
    {
        this.buildData = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "teamProject",
            this.teamProject);

        if (this.buildData != null)
        {
            this.buildData.writeAsElement(
                writer,
                "buildData");
        }

        writer.writeEndElement();
    }
}
