# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The core of the ament buildsystem in CMake.      Several subcomponents provide specific funtionalities:     * environment: provide prefix-level setup files     * environment_hooks: provide package-level setup files and environment hooks     * index: store information in an index and retrieve them without crawling     * package_templates: templates from the ament_package Python package     * symlink_install: use symlinks for CMake install commands"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-package cmake python3-catkin-pkg-modules"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_core/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a1364877da0271a04b35e8ec201b4c1"
SRC_URI[sha256sum] = "aca5f0d18da329865842ea0d460c986d7c0f0a874795ee6f78f40a1ac5113f37"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_core-0.6.0-4"

inherit catkin
