// Description: Java 11 JavaFX Display Element Factory Interface for TokenCol.

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
 *	ICFBamJavaFXTokenColFactory JavaFX Display Element Factory Interface
 *	for TokenCol.
 */
public interface ICFBamJavaFXTokenColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTokenColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamTokenColObj argFocus,
		Collection<ICFBamTokenColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTokenColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTokenColObj> argDataCollection,
		ICFBamJavaFXTokenColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTokenColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTokenColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTokenColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTokenColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTokenColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTokenColObj> argDataCollection,
		ICFBamJavaFXTokenColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTokenColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTokenColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
