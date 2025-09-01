// Description: Java 11 JavaFX Display Element Factory Interface for Table.

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
 *	ICFBamJavaFXTableFactory JavaFX Display Element Factory Interface
 *	for Table.
 */
public interface ICFBamJavaFXTableFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTableObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamTableObj argFocus,
		Collection<ICFBamTableObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTableObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTableObj> argDataCollection,
		ICFBamJavaFXTableChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTableObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTableObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTableObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTableObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTableObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTableObj> argDataCollection,
		ICFBamJavaFXTableChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTableObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTableObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
