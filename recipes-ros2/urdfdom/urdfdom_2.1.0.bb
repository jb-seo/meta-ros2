# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A library to access URDFs using the DOM model."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake console-bridge-vendor console-bridge libtinyxml tinyxml-vendor urdfdom-headers"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad1ef872a612427434362728807f4d44"
SRC_URI[sha256sum] = "27275c8ea3647c50538c85816341e1de41618345e4b54b9d30314886f9525b89"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-2.1.0-0"

inherit ament
