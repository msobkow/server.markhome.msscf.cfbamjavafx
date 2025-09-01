// Description: Java 11 JavaFX Display Element Factory Interface for StringType.

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
 *	ICFBamJavaFXStringTypeFactory JavaFX Display Element Factory Interface
 *	for StringType.
 */
public interface ICFBamJavaFXStringTypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamStringTypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamStringTypeObj argFocus,
		Collection<ICFBamStringTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamStringTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamStringTypeObj> argDataCollection,
		ICFBamJavaFXStringTypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamStringTypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamStringTypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamStringTypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamStringTypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamStringTypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamStringTypeObj> argDataCollection,
		ICFBamJavaFXStringTypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamStringTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamStringTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
