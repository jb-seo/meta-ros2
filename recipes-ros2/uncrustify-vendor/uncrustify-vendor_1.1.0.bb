# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around uncrustify, providing nothing but a dependency on uncrustify, on some systems.     On others, it provides an ExternalProject build of uncrustify."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "ament-cmake uncrustify"
SRC_URI = "https://github.com/ros2-gbp/uncrustify_vendor-release/archive/release/crystal/uncrustify_vendor/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f4876a68076cd82e875c6408139f90d"
SRC_URI[sha256sum] = "e81702fda146eb9e430cb382a925c852d768aee7f801fe35df14c91cc2efbed5"
S = "${WORKDIR}/uncrustify_vendor-release-release-crystal-uncrustify_vendor-1.1.0-0"

inherit catkin
