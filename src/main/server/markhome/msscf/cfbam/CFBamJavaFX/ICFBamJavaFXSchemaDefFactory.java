// Description: Java 11 JavaFX Display Element Factory Interface for SchemaDef.

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
 *	ICFBamJavaFXSchemaDefFactory JavaFX Display Element Factory Interface
 *	for SchemaDef.
 */
public interface ICFBamJavaFXSchemaDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamSchemaDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFIntMinorVersionObj argContainer,
		ICFBamSchemaDefObj argFocus,
		Collection<ICFBamSchemaDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argFocus,
		ICFIntMinorVersionObj argContainer,
		Collection<ICFBamSchemaDefObj> argDataCollection,
		ICFBamJavaFXSchemaDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamSchemaDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamSchemaDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamSchemaDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamSchemaDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamSchemaDefObj javaFXFocus,
		ICFIntMinorVersionObj argContainer,
		Collection<ICFBamSchemaDefObj> argDataCollection,
		ICFBamJavaFXSchemaDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamSchemaDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamSchemaDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
