// Description: Java 11 JavaFX Display Element Factory Interface for UuidGen.

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
 *	ICFBamJavaFXUuidGenFactory JavaFX Display Element Factory Interface
 *	for UuidGen.
 */
public interface ICFBamJavaFXUuidGenFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidGenObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamUuidGenObj argFocus,
		Collection<ICFBamUuidGenObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidGenObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidGenObj> argDataCollection,
		ICFBamJavaFXUuidGenChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamUuidGenObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidGenObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamUuidGenObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamUuidGenObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidGenObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidGenObj> argDataCollection,
		ICFBamJavaFXUuidGenChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidGenObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidGenObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
