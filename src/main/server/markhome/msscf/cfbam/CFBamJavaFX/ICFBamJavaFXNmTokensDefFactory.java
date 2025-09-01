// Description: Java 11 JavaFX Display Element Factory Interface for NmTokensDef.

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
 *	ICFBamJavaFXNmTokensDefFactory JavaFX Display Element Factory Interface
 *	for NmTokensDef.
 */
public interface ICFBamJavaFXNmTokensDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNmTokensDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamNmTokensDefObj argFocus,
		Collection<ICFBamNmTokensDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNmTokensDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNmTokensDefObj> argDataCollection,
		ICFBamJavaFXNmTokensDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamNmTokensDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNmTokensDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamNmTokensDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamNmTokensDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNmTokensDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNmTokensDefObj> argDataCollection,
		ICFBamJavaFXNmTokensDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNmTokensDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNmTokensDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
