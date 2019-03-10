# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around libyaml, provides the last version (1.8.0 rc) that ships with a CMake module"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/libyaml_vendor-release/archive/release/crystal/libyaml_vendor/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c70cb2bfde7747051c052bb3c839d6e6"
SRC_URI[sha256sum] = "54515207095b2974e152995adc92a9d0bf88b885336bbefcc26ca404af305188"
S = "${WORKDIR}/libyaml_vendor-release-release-crystal-libyaml_vendor-1.0.0-0"

inherit catkin
