# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description     Format (URDF), which is an XML format for representing a robot model.     The code API of the parser has been through our review process and will remain     backwards compatible in future releases."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "console-bridge tinyxml-vendor urdfdom urdfdom-headers libtinyxml"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bedf661a126d2720130807542deaa01"
SRC_URI[sha256sum] = "2e8ea3503c1ebcf88b1a25ebd9625c25e765666fae6d28d1402093f4520dbb0f"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-2.1.0-0"

inherit ros
inherit ament


