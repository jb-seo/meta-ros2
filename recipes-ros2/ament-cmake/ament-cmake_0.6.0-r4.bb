# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The entry point package for the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-export-definitions ament-cmake-export-dependencies ament-cmake-export-include-directories ament-cmake-export-interfaces ament-cmake-export-libraries ament-cmake-export-link-flags ament-cmake-libraries ament-cmake-python ament-cmake-target-dependencies ament-cmake-test cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed00d7759692ba885d59b7b23a948d43"
SRC_URI[sha256sum] = "47e7234340237f18b4051b83b437dea8879cb623b560aeb65c44b0d585116599"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
