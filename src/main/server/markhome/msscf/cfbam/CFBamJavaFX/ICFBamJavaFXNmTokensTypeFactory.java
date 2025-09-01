// Description: Java 11 JavaFX Display Element Factory Interface for NmTokensType.

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
 *	ICFBamJavaFXNmTokensTypeFactory JavaFX Display Element Factory Interface
 *	for NmTokensType.
 */
public interface ICFBamJavaFXNmTokensTypeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNmTokensTypeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamNmTokensTypeObj argFocus,
		Collection<ICFBamNmTokensTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNmTokensTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamNmTokensTypeObj> argDataCollection,
		ICFBamJavaFXNmTokensTypeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamNmTokensTypeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNmTokensTypeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamNmTokensTypeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamNmTokensTypeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNmTokensTypeObj javaFXFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamNmTokensTypeObj> argDataCollection,
		ICFBamJavaFXNmTokensTypeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNmTokensTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNmTokensTypeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
