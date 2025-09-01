// Description: Java 11 JavaFX Display Element Factory Interface for DateType.

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
 *	ICFBamJavaFXDateTypeFactory JavaFX Display Element Factory Interface
 *	for DateType.
 */
public interface ICFBamJavaFXDateTypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDateTypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamDateTypeObj argFocus,
		Collection<ICFBamDateTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDateTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDateTypeObj> argDataCollection,
		ICFBamJavaFXDateTypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDateTypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDateTypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDateTypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDateTypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDateTypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDateTypeObj> argDataCollection,
		ICFBamJavaFXDateTypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDateTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDateTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
