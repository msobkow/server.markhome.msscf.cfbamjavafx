// Description: Java 11 JavaFX Display Element Factory Interface for TextCol.

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
 *	ICFBamJavaFXTextColFactory JavaFX Display Element Factory Interface
 *	for TextCol.
 */
public interface ICFBamJavaFXTextColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTextColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamTextColObj argFocus,
		Collection<ICFBamTextColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTextColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTextColObj> argDataCollection,
		ICFBamJavaFXTextColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTextColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTextColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTextColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTextColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTextColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTextColObj> argDataCollection,
		ICFBamJavaFXTextColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTextColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTextColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
