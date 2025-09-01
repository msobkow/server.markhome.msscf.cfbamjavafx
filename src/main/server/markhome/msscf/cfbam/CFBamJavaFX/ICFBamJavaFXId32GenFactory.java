// Description: Java 11 JavaFX Display Element Factory Interface for Id32Gen.

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
 *	ICFBamJavaFXId32GenFactory JavaFX Display Element Factory Interface
 *	for Id32Gen.
 */
public interface ICFBamJavaFXId32GenFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamId32GenObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamId32GenObj argFocus,
		Collection<ICFBamId32GenObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamId32GenObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamId32GenObj> argDataCollection,
		ICFBamJavaFXId32GenChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamId32GenObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamId32GenObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamId32GenObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamId32GenObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamId32GenObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamId32GenObj> argDataCollection,
		ICFBamJavaFXId32GenChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamId32GenObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamId32GenObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
