// Description: Java 11 JavaFX Display Element Factory Interface for UuidType.

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
 *	ICFBamJavaFXUuidTypeFactory JavaFX Display Element Factory Interface
 *	for UuidType.
 */
public interface ICFBamJavaFXUuidTypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidTypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamUuidTypeObj argFocus,
		Collection<ICFBamUuidTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidTypeObj> argDataCollection,
		ICFBamJavaFXUuidTypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamUuidTypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidTypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamUuidTypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamUuidTypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidTypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidTypeObj> argDataCollection,
		ICFBamJavaFXUuidTypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
