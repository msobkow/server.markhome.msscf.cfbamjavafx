// Description: Java 11 JavaFX Display Element Factory Interface for TimeCol.

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
 *	ICFBamJavaFXTimeColFactory JavaFX Display Element Factory Interface
 *	for TimeCol.
 */
public interface ICFBamJavaFXTimeColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTimeColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamTimeColObj argFocus,
		Collection<ICFBamTimeColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTimeColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTimeColObj> argDataCollection,
		ICFBamJavaFXTimeColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTimeColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTimeColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTimeColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTimeColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTimeColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTimeColObj> argDataCollection,
		ICFBamJavaFXTimeColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTimeColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTimeColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
