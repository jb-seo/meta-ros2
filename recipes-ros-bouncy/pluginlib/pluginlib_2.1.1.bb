# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins using the ROS build infrastructure.     To work, these tools require plugin providers to register their plugins in the package.xml of their package."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "class-loader rcutils tinyxml2-vendor"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a54d0c08cb5e970585796f47d7d9fc5"
SRC_URI[sha256sum] = "8485f210e59c7ccd3d1d7f5add2fb57ec33ebd5561b234276801a515ae64a4f5"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-2.1.1-0"


inherit ros
inherit ament

