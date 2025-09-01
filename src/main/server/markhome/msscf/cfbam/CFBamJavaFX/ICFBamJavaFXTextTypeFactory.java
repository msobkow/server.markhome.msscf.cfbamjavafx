// Description: Java 11 JavaFX Display Element Factory Interface for TextType.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	ICFBamJavaFXTextTypeFactory JavaFX Display Element Factory Interface
 *	for TextType.
 */
public interface ICFBamJavaFXTextTypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTextTypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamTextTypeObj argFocus,
		Collection<ICFBamTextTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTextTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTextTypeObj> argDataCollection,
		ICFBamJavaFXTextTypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTextTypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTextTypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTextTypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTextTypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTextTypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTextTypeObj> argDataCollection,
		ICFBamJavaFXTextTypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTextTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTextTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
