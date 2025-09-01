// Description: Java 11 JavaFX Display Element Factory Interface for Param.

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
 *	ICFBamJavaFXParamFactory JavaFX Display Element Factory Interface
 *	for Param.
 */
public interface ICFBamJavaFXParamFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamParamObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamServerMethodObj argContainer,
		ICFBamParamObj argFocus,
		Collection<ICFBamParamObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamParamObj argFocus,
		ICFBamServerMethodObj argContainer,
		Collection<ICFBamParamObj> argDataCollection,
		ICFBamJavaFXParamChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamParamObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamParamObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamParamObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamParamObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamParamObj javaFXFocus,
		ICFBamServerMethodObj argContainer,
		Collection<ICFBamParamObj> argDataCollection,
		ICFBamJavaFXParamChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamParamObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamParamObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
