// Description: Java 11 JavaFX Display Element Factory Interface for UuidDef.

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
 *	ICFBamJavaFXUuidDefFactory JavaFX Display Element Factory Interface
 *	for UuidDef.
 */
public interface ICFBamJavaFXUuidDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamUuidDefObj argFocus,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFBamJavaFXUuidDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamUuidDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamUuidDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamUuidDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFBamJavaFXUuidDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
