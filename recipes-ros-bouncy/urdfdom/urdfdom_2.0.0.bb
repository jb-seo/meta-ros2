# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A library to access URDFs using the DOM model."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "console-bridge tinyxml-vendor urdfdom-headers cmake libtinyxml"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d273cff11de4cafbb898f3024290181b"
SRC_URI[sha256sum] = "b13ced6b5353353ed0a52744b6f917e303021c65a50726e3c83a62f0091f18fd"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-2.0.0-0"


inherit ros
inherit cmake

