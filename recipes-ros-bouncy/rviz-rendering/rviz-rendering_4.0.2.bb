# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library which provides the 3D rendering functionality in rviz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "resource-retriever rviz-assimp-vendor rviz-ogre-vendor eigen libqt5-core libqt5-gui libqt5-opengl libqt5-widgets qtbase5-dev"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_rendering/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "043f19b1fd1e353e895a3dd50c72a054"
SRC_URI[sha256sum] = "39023698a5c52d99b6a7195c4e1809820beffd420258531c51b397ac5365bc1a"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_rendering-4.0.2-0"


inherit ros
inherit ament

