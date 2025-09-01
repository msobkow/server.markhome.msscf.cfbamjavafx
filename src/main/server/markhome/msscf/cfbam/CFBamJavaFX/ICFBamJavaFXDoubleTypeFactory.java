// Description: Java 11 JavaFX Display Element Factory Interface for DoubleType.

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
 *	ICFBamJavaFXDoubleTypeFactory JavaFX Display Element Factory Interface
 *	for DoubleType.
 */
public interface ICFBamJavaFXDoubleTypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDoubleTypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamDoubleTypeObj argFocus,
		Collection<ICFBamDoubleTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDoubleTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDoubleTypeObj> argDataCollection,
		ICFBamJavaFXDoubleTypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDoubleTypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDoubleTypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDoubleTypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDoubleTypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDoubleTypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDoubleTypeObj> argDataCollection,
		ICFBamJavaFXDoubleTypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDoubleTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDoubleTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
