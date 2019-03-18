# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description     Format (URDF), which is an XML format for representing a robot model.     The code API of the parser has been through our review process and will remain     backwards compatible in future releases."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " libtinyxml tinyxml-vendor urdfdom urdfdom-headers"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/2.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "91e961e234a8e9f8a14357d2cc3f04b5"
SRC_URI[sha256sum] = "541212cb509c15483e69146739bb03deae092d7a70173b8eda23c33bd391e307"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-2.2.0-0"

inherit ament
