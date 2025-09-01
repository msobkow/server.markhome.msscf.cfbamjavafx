// Description: Java 11 JavaFX Display Element Factory Interface for TimestampDef.

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
 *	ICFBamJavaFXTimestampDefFactory JavaFX Display Element Factory Interface
 *	for TimestampDef.
 */
public interface ICFBamJavaFXTimestampDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTimestampDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTimestampDefObj argFocus,
		Collection<ICFBamTimestampDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTimestampDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTimestampDefObj> argDataCollection,
		ICFBamJavaFXTimestampDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTimestampDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTimestampDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTimestampDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTimestampDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTimestampDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTimestampDefObj> argDataCollection,
		ICFBamJavaFXTimestampDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTimestampDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTimestampDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
