// Description: Java 11 JavaFX Display Element Factory Interface for Int64Type.

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
 *	ICFBamJavaFXInt64TypeFactory JavaFX Display Element Factory Interface
 *	for Int64Type.
 */
public interface ICFBamJavaFXInt64TypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamInt64TypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamInt64TypeObj argFocus,
		Collection<ICFBamInt64TypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamInt64TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamInt64TypeObj> argDataCollection,
		ICFBamJavaFXInt64TypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamInt64TypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamInt64TypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamInt64TypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamInt64TypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamInt64TypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamInt64TypeObj> argDataCollection,
		ICFBamJavaFXInt64TypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamInt64TypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamInt64TypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
