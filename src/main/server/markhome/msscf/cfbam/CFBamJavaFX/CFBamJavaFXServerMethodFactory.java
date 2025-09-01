// Description: Java 11 JavaFX Display Element Factory for ServerMethod.

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
 *	CFBamJavaFXServerMethodFactory JavaFX Display Element Factory
 *	for ServerMethod.
 */
public class CFBamJavaFXServerMethodFactory
implements ICFBamJavaFXServerMethodFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXServerMethodFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamServerMethodObj argFocus ) {
		CFBamJavaFXServerMethodAttrPane retnew = new CFBamJavaFXServerMethodAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamServerMethodObj argFocus,
		Collection<ICFBamServerMethodObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXServerMethodListPane retnew = new CFBamJavaFXServerMethodListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamServerMethodObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerMethodObj> argDataCollection,
		ICFBamJavaFXServerMethodChosen whenChosen )
	{
		CFBamJavaFXServerMethodPickerPane retnew = new CFBamJavaFXServerMethodPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamServerMethodObj argFocus ) {
		CFBamJavaFXServerMethodEltTabPane retnew = new CFBamJavaFXServerMethodEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamServerMethodObj argFocus ) {
		CFBamJavaFXServerMethodAddPane retnew = new CFBamJavaFXServerMethodAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamServerMethodObj argFocus ) {
		CFBamJavaFXServerMethodViewEditPane retnew = new CFBamJavaFXServerMethodViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamServerMethodObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXServerMethodAskDeleteForm retnew = new CFBamJavaFXServerMethodAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamServerMethodObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerMethodObj> argDataCollection,
		ICFBamJavaFXServerMethodChosen whenChosen )
	{
		CFBamJavaFXServerMethodPickerForm retnew = new CFBamJavaFXServerMethodPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamServerMethodObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXServerMethodAddForm retnew = new CFBamJavaFXServerMethodAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamServerMethodObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXServerMethodViewEditForm retnew = new CFBamJavaFXServerMethodViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
