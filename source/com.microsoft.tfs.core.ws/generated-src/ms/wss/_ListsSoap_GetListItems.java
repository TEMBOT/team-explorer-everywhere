// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.wss._ListsSoap_GetListItems;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ListsSoap_GetListItems
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String listName;
    protected String viewName;
    protected AnyContentType query;
    protected AnyContentType viewFields;
    protected String rowLimit;
    protected AnyContentType queryOptions;
    protected String webID;

    public _ListsSoap_GetListItems()
    {
        super();
    }

    public _ListsSoap_GetListItems(
        final String listName,
        final String viewName,
        final AnyContentType query,
        final AnyContentType viewFields,
        final String rowLimit,
        final AnyContentType queryOptions,
        final String webID)
    {
        // TODO : Call super() instead of setting all fields directly?
        setListName(listName);
        setViewName(viewName);
        setQuery(query);
        setViewFields(viewFields);
        setRowLimit(rowLimit);
        setQueryOptions(queryOptions);
        setWebID(webID);
    }

    public String getListName()
    {
        return this.listName;
    }

    public void setListName(String value)
    {
        this.listName = value;
    }

    public String getViewName()
    {
        return this.viewName;
    }

    public void setViewName(String value)
    {
        this.viewName = value;
    }

    public AnyContentType getQuery()
    {
        return this.query;
    }

    public void setQuery(AnyContentType value)
    {
        this.query = value;
    }

    public AnyContentType getViewFields()
    {
        return this.viewFields;
    }

    public void setViewFields(AnyContentType value)
    {
        this.viewFields = value;
    }

    public String getRowLimit()
    {
        return this.rowLimit;
    }

    public void setRowLimit(String value)
    {
        this.rowLimit = value;
    }

    public AnyContentType getQueryOptions()
    {
        return this.queryOptions;
    }

    public void setQueryOptions(AnyContentType value)
    {
        this.queryOptions = value;
    }

    public String getWebID()
    {
        return this.webID;
    }

    public void setWebID(String value)
    {
        this.webID = value;
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
            "listName",
            this.listName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "viewName",
            this.viewName);
        this.query.writeAsElement(
            writer,
            "query");
        this.viewFields.writeAsElement(
            writer,
            "viewFields");
        XMLStreamWriterHelper.writeElement(
            writer,
            "rowLimit",
            this.rowLimit);
        this.queryOptions.writeAsElement(
            writer,
            "queryOptions");
        XMLStreamWriterHelper.writeElement(
            writer,
            "webID",
            this.webID);

        writer.writeEndElement();
    }
}
