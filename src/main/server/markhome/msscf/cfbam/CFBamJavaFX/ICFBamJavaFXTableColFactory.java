// Description: Java 11 JavaFX Display Element Factory Interface for TableCol.

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
 *	ICFBamJavaFXTableColFactory JavaFX Display Element Factory Interface
 *	for TableCol.
 */
public interface ICFBamJavaFXTableColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTableColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamTableColObj argFocus,
		Collection<ICFBamTableColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTableColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTableColObj> argDataCollection,
		ICFBamJavaFXTableColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTableColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTableColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTableColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTableColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTableColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTableColObj> argDataCollection,
		ICFBamJavaFXTableColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTableColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTableColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
