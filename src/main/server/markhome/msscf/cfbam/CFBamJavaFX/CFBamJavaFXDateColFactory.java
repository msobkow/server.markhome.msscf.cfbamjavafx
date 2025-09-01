// Description: Java 11 JavaFX Display Element Factory for DateCol.

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
 *	CFBamJavaFXDateColFactory JavaFX Display Element Factory
 *	for DateCol.
 */
public class CFBamJavaFXDateColFactory
implements ICFBamJavaFXDateColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXDateColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDateColObj argFocus ) {
		CFBamJavaFXDateColAttrPane retnew = new CFBamJavaFXDateColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamDateColObj argFocus,
		Collection<ICFBamDateColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXDateColListPane retnew = new CFBamJavaFXDateColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDateColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDateColObj> argDataCollection,
		ICFBamJavaFXDateColChosen whenChosen )
	{
		CFBamJavaFXDateColPickerPane retnew = new CFBamJavaFXDateColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamDateColObj argFocus ) {
		CFBamJavaFXDateColEltTabPane retnew = new CFBamJavaFXDateColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamDateColObj argFocus ) {
		CFBamJavaFXDateColAddPane retnew = new CFBamJavaFXDateColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamDateColObj argFocus ) {
		CFBamJavaFXDateColViewEditPane retnew = new CFBamJavaFXDateColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDateColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXDateColAskDeleteForm retnew = new CFBamJavaFXDateColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDateColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDateColObj> argDataCollection,
		ICFBamJavaFXDateColChosen whenChosen )
	{
		CFBamJavaFXDateColPickerForm retnew = new CFBamJavaFXDateColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDateColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXDateColAddForm retnew = new CFBamJavaFXDateColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDateColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXDateColViewEditForm retnew = new CFBamJavaFXDateColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
