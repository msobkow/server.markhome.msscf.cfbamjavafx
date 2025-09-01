// Description: Java 11 JavaFX Display Element Factory Interface for UInt16Type.

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
 *	ICFBamJavaFXUInt16TypeFactory JavaFX Display Element Factory Interface
 *	for UInt16Type.
 */
public interface ICFBamJavaFXUInt16TypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUInt16TypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamUInt16TypeObj argFocus,
		Collection<ICFBamUInt16TypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUInt16TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUInt16TypeObj> argDataCollection,
		ICFBamJavaFXUInt16TypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamUInt16TypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUInt16TypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamUInt16TypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamUInt16TypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUInt16TypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUInt16TypeObj> argDataCollection,
		ICFBamJavaFXUInt16TypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUInt16TypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUInt16TypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
