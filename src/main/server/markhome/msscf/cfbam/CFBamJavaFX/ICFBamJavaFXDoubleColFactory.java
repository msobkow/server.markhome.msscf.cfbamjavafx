// Description: Java 11 JavaFX Display Element Factory Interface for DoubleCol.

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
 *	ICFBamJavaFXDoubleColFactory JavaFX Display Element Factory Interface
 *	for DoubleCol.
 */
public interface ICFBamJavaFXDoubleColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDoubleColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamDoubleColObj argFocus,
		Collection<ICFBamDoubleColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDoubleColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDoubleColObj> argDataCollection,
		ICFBamJavaFXDoubleColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDoubleColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDoubleColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDoubleColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDoubleColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDoubleColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDoubleColObj> argDataCollection,
		ICFBamJavaFXDoubleColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDoubleColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDoubleColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
