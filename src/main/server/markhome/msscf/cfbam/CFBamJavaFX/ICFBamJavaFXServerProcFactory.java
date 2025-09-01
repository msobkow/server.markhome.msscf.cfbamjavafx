// Description: Java 11 JavaFX Display Element Factory Interface for ServerProc.

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
 *	ICFBamJavaFXServerProcFactory JavaFX Display Element Factory Interface
 *	for ServerProc.
 */
public interface ICFBamJavaFXServerProcFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamServerProcObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamServerProcObj argFocus,
		Collection<ICFBamServerProcObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamServerProcObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerProcObj> argDataCollection,
		ICFBamJavaFXServerProcChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamServerProcObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamServerProcObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamServerProcObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamServerProcObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamServerProcObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerProcObj> argDataCollection,
		ICFBamJavaFXServerProcChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamServerProcObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamServerProcObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
