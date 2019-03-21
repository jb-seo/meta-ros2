# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around tinyxml2, providing nothing but a dependency on tinyxml2, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of tinyxml2."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake libtinyxml2"
SRC_URI = "https://github.com/ros2-gbp/tinyxml2_vendor-release/archive/release/bouncy/tinyxml2_vendor/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6a25b5ff289dd74798e4d2b4a77c30a"
SRC_URI[sha256sum] = "a0c41d836a8e197e47c7be761a69de2a3ef6fdf0786807c1232958fac7830c17"
S = "${WORKDIR}/tinyxml2_vendor-release-release-bouncy-tinyxml2_vendor-0.4.0-0"

inherit ros
inherit cmake


