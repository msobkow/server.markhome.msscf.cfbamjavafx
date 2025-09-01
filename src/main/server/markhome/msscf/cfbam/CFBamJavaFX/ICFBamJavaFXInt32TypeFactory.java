// Description: Java 11 JavaFX Display Element Factory Interface for Int32Type.

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
 *	ICFBamJavaFXInt32TypeFactory JavaFX Display Element Factory Interface
 *	for Int32Type.
 */
public interface ICFBamJavaFXInt32TypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamInt32TypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamInt32TypeObj argFocus,
		Collection<ICFBamInt32TypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamInt32TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamInt32TypeObj> argDataCollection,
		ICFBamJavaFXInt32TypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamInt32TypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamInt32TypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamInt32TypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamInt32TypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamInt32TypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamInt32TypeObj> argDataCollection,
		ICFBamJavaFXInt32TypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamInt32TypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamInt32TypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
