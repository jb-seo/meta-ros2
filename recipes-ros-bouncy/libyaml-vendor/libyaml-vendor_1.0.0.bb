# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around libyaml, provides the last version (1.8.0 rc) that ships with a CMake module"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/libyaml_vendor-release/archive/release/bouncy/libyaml_vendor/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "79157d14bd69d32e3fa229dc9c3e981d"
SRC_URI[sha256sum] = "d63986cc17a6c606438fab7a024cc84e7f30f1b5ac5918f3120d3dd76f83ab43"
S = "${WORKDIR}/libyaml_vendor-release-release-bouncy-libyaml_vendor-1.0.0-0"


inherit ros
inherit ament

