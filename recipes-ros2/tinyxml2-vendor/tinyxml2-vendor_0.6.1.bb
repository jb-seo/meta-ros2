# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around tinyxml2, providing nothing but a dependency on tinyxml2, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of tinyxml2."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake libtinyxml2"
SRC_URI = "https://github.com/ros2-gbp/tinyxml2_vendor-release/archive/release/crystal/tinyxml2_vendor/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67784c0447a3199f3a5886ffe71f4e40"
SRC_URI[sha256sum] = "68aa18c4cdfc73098b30c5b59de57a85458e88e38f54b790442cf6ab05861514"
S = "${WORKDIR}/tinyxml2_vendor-release-release-crystal-tinyxml2_vendor-0.6.1-0"

inherit catkin
