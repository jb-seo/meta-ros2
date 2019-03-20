# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module to find PrismTech OpenSplice."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "libopensplice67"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/bouncy/opensplice_cmake_module/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c7663c651d13db2a98209d895f0a827"
SRC_URI[sha256sum] = "21b664df0d2713f19a091a73e802a1761ce9c0a25e2a341aec0aa8aeb3515219"
S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-bouncy-opensplice_cmake_module-0.5.0-0"


inherit ros
inherit ament

