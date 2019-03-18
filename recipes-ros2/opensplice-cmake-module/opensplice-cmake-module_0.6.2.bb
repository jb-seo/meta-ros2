# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module to find PrismTech OpenSplice."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/crystal/opensplice_cmake_module/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1f3a23873c0fbb1a298446476c1168f9"
SRC_URI[sha256sum] = "69219ec846df62ea9eb92c6985487e9f86a782e80dd89d8b83ba22a91d7f11a5"
S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-crystal-opensplice_cmake_module-0.6.2-0"

inherit ament
