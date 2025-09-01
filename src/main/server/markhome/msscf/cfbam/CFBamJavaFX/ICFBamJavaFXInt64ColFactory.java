// Description: Java 11 JavaFX Display Element Factory Interface for Int64Col.

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
 *	ICFBamJavaFXInt64ColFactory JavaFX Display Element Factory Interface
 *	for Int64Col.
 */
public interface ICFBamJavaFXInt64ColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamInt64ColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamInt64ColObj argFocus,
		Collection<ICFBamInt64ColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamInt64ColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamInt64ColObj> argDataCollection,
		ICFBamJavaFXInt64ColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamInt64ColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamInt64ColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamInt64ColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamInt64ColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamInt64ColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamInt64ColObj> argDataCollection,
		ICFBamJavaFXInt64ColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamInt64ColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamInt64ColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
