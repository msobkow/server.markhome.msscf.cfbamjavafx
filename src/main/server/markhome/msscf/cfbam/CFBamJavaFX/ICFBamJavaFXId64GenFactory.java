// Description: Java 11 JavaFX Display Element Factory Interface for Id64Gen.

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
 *	ICFBamJavaFXId64GenFactory JavaFX Display Element Factory Interface
 *	for Id64Gen.
 */
public interface ICFBamJavaFXId64GenFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamId64GenObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamId64GenObj argFocus,
		Collection<ICFBamId64GenObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamId64GenObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamId64GenObj> argDataCollection,
		ICFBamJavaFXId64GenChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamId64GenObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamId64GenObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamId64GenObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamId64GenObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamId64GenObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamId64GenObj> argDataCollection,
		ICFBamJavaFXId64GenChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamId64GenObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamId64GenObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
