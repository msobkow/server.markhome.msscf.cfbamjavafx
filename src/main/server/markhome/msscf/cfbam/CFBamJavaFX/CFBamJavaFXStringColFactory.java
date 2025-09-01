// Description: Java 11 JavaFX Display Element Factory for StringCol.

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
 *	CFBamJavaFXStringColFactory JavaFX Display Element Factory
 *	for StringCol.
 */
public class CFBamJavaFXStringColFactory
implements ICFBamJavaFXStringColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXStringColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamStringColObj argFocus ) {
		CFBamJavaFXStringColAttrPane retnew = new CFBamJavaFXStringColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamStringColObj argFocus,
		Collection<ICFBamStringColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXStringColListPane retnew = new CFBamJavaFXStringColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamStringColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamStringColObj> argDataCollection,
		ICFBamJavaFXStringColChosen whenChosen )
	{
		CFBamJavaFXStringColPickerPane retnew = new CFBamJavaFXStringColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamStringColObj argFocus ) {
		CFBamJavaFXStringColEltTabPane retnew = new CFBamJavaFXStringColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamStringColObj argFocus ) {
		CFBamJavaFXStringColAddPane retnew = new CFBamJavaFXStringColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamStringColObj argFocus ) {
		CFBamJavaFXStringColViewEditPane retnew = new CFBamJavaFXStringColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamStringColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXStringColAskDeleteForm retnew = new CFBamJavaFXStringColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamStringColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamStringColObj> argDataCollection,
		ICFBamJavaFXStringColChosen whenChosen )
	{
		CFBamJavaFXStringColPickerForm retnew = new CFBamJavaFXStringColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamStringColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXStringColAddForm retnew = new CFBamJavaFXStringColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamStringColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXStringColViewEditForm retnew = new CFBamJavaFXStringColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
